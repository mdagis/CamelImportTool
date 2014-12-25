package gr.cloudbiz.camelimporttool.routes;

import gr.cloudbiz.camelimporttool.dto.RegistrationMember;
import gr.cloudbiz.camelimporttool.processors.HttpResultProcessor;
import gr.cloudbiz.camelimporttool.processors.RegistrationMemberProcessor;
import org.apache.camel.Exchange;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.BindyType;
import org.apache.camel.model.dataformat.JsonLibrary;

/**
 *
 * @author agis
 */
public class TextToHttpRoute extends RouteBuilder {

    public TextToHttpRoute() {

    }

    @Override
    public void configure() {

        from("file:.?noop=true&charset=UTF-8&fileName=test.txt")
                .convertBodyTo(String.class, "utf-8")
                .split(body().tokenize("\n"))
                .log("Line IS: ${body}")
                .unmarshal()
                .bindy(BindyType.Csv, RegistrationMember.class)
                .process(new RegistrationMemberProcessor())
                .marshal().json(JsonLibrary.Jackson, RegistrationMember.class)
                .log("json is: ${body}")
                .setHeader(Exchange.HTTP_METHOD, constant("PUT"))
                .setHeader(Exchange.CONTENT_TYPE, constant("application/json"))
                .setHeader("accept", constant("application/json"))
                .to("http://serverurl/rest/loyalty/members/?authMethod=Basic&authUsername=user&authPassword=pass")
                .process(new HttpResultProcessor());
    }

}
