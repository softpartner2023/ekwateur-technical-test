package fr.ekwateur.billing.mapper;

import fr.ekwateur.billing.domain.BillRequest;
import fr.ekwateur.billing.dto.BillRequestDto;
import org.mapstruct.Mapper;

@Mapper
public interface BillRequestMapper {

BillRequest toBillRequest(BillRequestDto billRequestDto);

}