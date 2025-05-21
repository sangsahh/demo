package com.example.demo.dto.response;

import java.util.List;
import lombok.Data;
import com.example.demo.config.ErrorCode;


@Data
public class HistorySearchResponseDTO {
    private int code;
    private String returnCode;
    private String resultCodeDesc;
    private String httpStatus;
    private String message;
    List<ResponseDTO> responseDTO;


} 