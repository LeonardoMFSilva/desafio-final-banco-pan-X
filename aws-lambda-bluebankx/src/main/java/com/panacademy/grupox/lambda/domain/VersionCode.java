package com.panacademy.grupox.lambda.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class VersionCode {

    private int id;
    private String version;
    private String modificationDate;
    private String size;
}
