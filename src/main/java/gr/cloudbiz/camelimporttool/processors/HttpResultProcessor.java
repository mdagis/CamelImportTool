package gr.cloudbiz.camelimporttool.processors;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 *
 * @author agis
 */
public class HttpResultProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        String response = exchange.getIn().getBody(String.class);
        exchange.getIn().setBody(response);
        System.out.println(response);
    }

}
