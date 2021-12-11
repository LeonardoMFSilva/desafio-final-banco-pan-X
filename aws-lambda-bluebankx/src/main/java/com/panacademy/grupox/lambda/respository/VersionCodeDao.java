package com.panacademy.grupox.lambda.respository;

import com.panacademy.grupox.lambda.domain.VersionCode;
import org.springframework.stereotype.Repository;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Repository
public class VersionCodeDao {

    public List<VersionCode> buildVersionCode(){
        return Stream.of(
                new VersionCode(1,"1.0",gerarNumConta(),"61203182bytes")
        ).collect(Collectors.toList());
    }
    public static String gerarNumConta(){
        SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyyy");
        return d.format(new Date());
    }
}
