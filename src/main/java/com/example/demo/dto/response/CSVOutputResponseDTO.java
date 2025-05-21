package com.example.demo.dto.response;

import java.util.List;
import lombok.Data;

/**
 * CSV出力用の予約情報DTO
 */
@Data
public class CSVOutputResponseDTO {
    List<ResponseDTO> responseDTO;
}
