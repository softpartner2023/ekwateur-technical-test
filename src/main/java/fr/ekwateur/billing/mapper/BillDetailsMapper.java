package fr.ekwateur.billing.mapper;

import fr.ekwateur.billing.domain.BillDetails;
import fr.ekwateur.billing.dto.BillDetailsDto;
import org.mapstruct.Mapper;

@Mapper
public interface BillDetailsMapper {

BillDetailsDto toBillDetailsDto(BillDetails billDetails);

}
