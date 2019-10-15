package com.gpf.model.result;

//import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description: 结果封装
 * @package: com.gpf.result
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/9/20 17:40
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
//@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResultMap<T> {
    private String operation;
    private int code = 200;
    private String message = "success";
    private T result;
    private List<T> results;

    public ResultMap getResult(T result,String operation){
        this.result = result;
        return this;
    }
    public ResultMap getResults(List<T> results,String operation){
        this.results = results;
        this.operation = operation;
        return this;
    }
}
