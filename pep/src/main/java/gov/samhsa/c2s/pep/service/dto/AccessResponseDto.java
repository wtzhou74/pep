package gov.samhsa.c2s.pep.service.dto;

import gov.samhsa.c2s.pep.infrastructure.dto.DSSResponse;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AccessResponseDto {
    @NotEmpty
    private byte[] segmentedDocument;

    @NotBlank
    private String segmentedDocumentEncoding;

    public static AccessResponseDto from(DSSResponse dssResponse) {
        return AccessResponseDto.builder()
                .segmentedDocument(dssResponse.getSegmentedDocument())
                .segmentedDocumentEncoding(dssResponse.getEncoding())
                .build();
    }
}
