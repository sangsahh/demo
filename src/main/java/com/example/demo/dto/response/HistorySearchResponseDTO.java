package com.example.demo.dto.response;

import java.util.List;
import lombok.Data;
import com.example.demo.config.ErrorCode;


@Data
public class HistorySearchResponseDTO {
    List<ResponseDTO> responseDTO;
} 