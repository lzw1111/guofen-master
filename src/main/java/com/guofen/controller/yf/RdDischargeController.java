package com.guofen.controller.yf;


import com.guofen.pojo.RdDischarge;
import com.guofen.service.yf.RdDischargeService;
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
@Api("研发出料表")
public class RdDischargeController {
    @Resource
    private RdDischargeService rdDischargeService;

    @ApiOperation("提交出料数据现场记录")
    @PostMapping("/research/discharge/add")
    public boolean submitAllInfo(@RequestParam("dischargeDate") String dischargeDate,@RequestParam("dischargeStarttime") String dischargeStarttime,
                                 @RequestParam("dischargeEndtime") String dischargeEndtime,@RequestParam("sieveStarttime") String sieveStarttime,@RequestParam("sieveEndtime") String sieveEndtime,
                                 @RequestParam("insectSeparateStarttime") String insectSeparateStarttime,@RequestParam("insectSeparateEndtime") String insectSeparateEndtime,@RequestParam("deviceName") String deviceName,
                                 @RequestParam("batch") String batch,@RequestParam("zubie") int zubie,@RequestParam("boxNumber") int boxNumber,@RequestParam("dischargeBoxWeight") double dischargeBoxWeight,
                                 @RequestParam("boxWeight") double boxWeight,@RequestParam("insectImpurityWeight") double insectImpurityWeight,@RequestParam("insectDungWeight") double insectDungWeight,
                                 @RequestParam("sieveWeight") double sieveWeight,@RequestParam("surfaceFiberWeight") double surfaceFiberWeight,@RequestParam("insectWeight") double insectWeight,
                                 @RequestParam("impurityWeight") double impurityWeight,@RequestParam(value = "remark",defaultValue = "",required = false) String remark){
        return rdDischargeService.submitAllInfo(new RdDischarge(dischargeDate,dischargeStarttime,dischargeEndtime,sieveStarttime,sieveEndtime,insectSeparateStarttime,insectSeparateEndtime,deviceName,batch,zubie,boxNumber,dischargeBoxWeight,
                boxWeight,insectImpurityWeight,insectDungWeight,sieveWeight,surfaceFiberWeight,insectWeight,impurityWeight,remark));
    }
    @ApiOperation("获取 当日 最新 一条记录")
    @GetMapping(value = "/research/discharge/getlast")
    public Result getlast(){
        return  ResultGenerator.genSuccessResult(rdDischargeService.getlast());
    }

}