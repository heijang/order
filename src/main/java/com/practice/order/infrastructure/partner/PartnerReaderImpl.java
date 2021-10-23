package com.practice.order.infrastructure.partner;

import com.practice.order.common.exception.EntityNotFoundException;
import com.practice.order.domain.partner.Partner;
import com.practice.order.domain.partner.PartnerReader;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
@RequiredArgsConstructor
public class PartnerReaderImpl implements PartnerReader {
    private final PartnerRepository partnerRepository;

    @Override
    public Partner getPartner(String partnerToken) {
        Partner partner = partnerRepository.findByPartnerToken(partnerToken)
                .orElseThrow(EntityNotFoundException::new);

        return partner;
    }
}
