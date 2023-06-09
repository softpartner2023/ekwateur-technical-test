package fr.ekwateur.billing.controller;

import fr.ekwateur.billing.domain.BillDetails;
import fr.ekwateur.billing.domain.BillRequest;
import fr.ekwateur.billing.dto.BillDetailsDto;
import fr.ekwateur.billing.dto.BillRequestDto;
import fr.ekwateur.billing.mapper.BillDetailsMapper;
import fr.ekwateur.billing.mapper.BillRequestMapper;
import fr.ekwateur.billing.service.BillingService;
import io.swagger.annotations.ApiOperation;
import org.mapstruct.factory.Mappers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class BillingController {

    @Autowired
    private BillingService billingService;

    private BillRequestMapper billRequestMapper = Mappers.getMapper( BillRequestMapper.class );

    private BillDetailsMapper billDetailsMapper = Mappers.getMapper( BillDetailsMapper.class );

    @PostMapping("/billing")
    @ApiOperation(value = "Get Bill details",
            response = BillDetailsDto.class)
    public ResponseEntity<BillDetailsDto> getBillDetails(@RequestBody BillRequestDto billRequestDto) {
        BillRequest billRequest = billRequestMapper.toBillRequest(billRequestDto);
        BillDetails billDetailsDto = billingService.getBillDetails(billRequest);
        return  ResponseEntity.status(HttpStatus.OK)
                .body(billDetailsMapper.toBillDetailsDto(billDetailsDto));
    }

}
