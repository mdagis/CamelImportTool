package gr.cloudbiz.camelimporttool.processors;

import gr.cloudbiz.camelimporttool.dto.GenderEnum;
import gr.cloudbiz.camelimporttool.dto.RegistrationMember;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

/**
 *
 * @author agis
 */
public class RegistrationMemberProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        RegistrationMember member = exchange.getIn().getBody(RegistrationMember.class);
        member.setRegistrationCode("0000");
        member.setGender(GenderEnum.UNKNOWN);
        member.setDeleteFlag(false);
        exchange.getIn().setBody(member);
    }

}
