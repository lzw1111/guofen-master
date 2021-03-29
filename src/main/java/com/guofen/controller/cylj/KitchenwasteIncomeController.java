package com.guofen.controller.cylj;

import com.guofen.pojo.KitchenwasteIncome;
import com.guofen.service.cylj.KitchenwasteIncomeService;
import com.guofen.util.Result.Result;
import com.guofen.util.Result.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api("厨余垃圾黑水虻就地处理站来料记录表")
public class KitchenwasteIncomeController {
    @Resource
    private KitchenwasteIncomeService kitchenwasteIncomeService;

    @ApiOperation("提交厨余垃圾黑水虻就地处理站来料记录")
    @PostMapping("/kitchenwaste/income/add")
    public boolean submitAllInfo(@RequestParam("incomeDate") String incomeDate,@RequestParam("incomeWeight") String incomeWeightstr,@RequestParam("bucketWeight") String bucketWeightstr,
                                 @RequestParam("waterWeight") String waterWeightstr,@RequestParam("impurityWeight") String impurityWeightstr,@RequestParam("incomeNetweight") String incomeNetweightstr,
                                 @RequestParam("feedWeight") String feedWeightstr,@RequestParam("cultivationWeight") String cultivationWeightstr, @RequestParam("throwWeight") String throwWeightstr,
                                 @RequestParam(value = "remark",defaultValue = "",required = false) String remark){
        double incomeWeight = Double.parseDouble(incomeWeightstr);
        double bucketWeight = Double.parseDouble(bucketWeightstr);
        double waterWeight = Double.parseDouble(waterWeightstr);
        double impurityWeight = Double.parseDouble(impurityWeightstr);
        double incomeNetweight = Double.parseDouble(incomeNetweightstr);
        double feedWeight = Double.parseDouble(feedWeightstr);
        double cultivationWeight = Double.parseDouble(cultivationWeightstr);
        double throwWeight = Double.parseDouble(throwWeightstr);
        return kitchenwasteIncomeService.submitAllIndfo(new KitchenwasteIncome(incomeDate,incomeWeight,bucketWeight,waterWeight,impurityWeight,incomeNetweight,feedWeight,cultivationWeight,throwWeight,remark));
    }
    @ApiOperation("获取 当日 最新 一条记录")
    @GetMapping(value = "/kitchenwaste/income/getlast")
    public Result getlast(){
        return  ResultGenerator.genSuccessResult(kitchenwasteIncomeService.getlast());
    }
}
