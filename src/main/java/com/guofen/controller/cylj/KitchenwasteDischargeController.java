package com.guofen.controller.cylj;

import com.guofen.pojo.KitchenwasteDischarge;
import com.guofen.service.cylj.KitchenwasteDischargeService;
import com.guofen.util.Result.Result;
import com.guofen.util.Result.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@Api("厨余垃圾黑水虻就地处理站出料记录表")
public class KitchenwasteDischargeController {
    @Resource
    private KitchenwasteDischargeService kitchenwasteDischargeService;

    @ApiOperation("提交厨余垃圾黑水虻就地处理站出料记录")
    @PostMapping("/kitchenwaste/discharge/add")
    public boolean submitAllInfo(@RequestParam("dischargeDate") String dischargeDate, @RequestParam("incomeDate") String incomeDate, @RequestParam("cabinetNumber") String cabinetNumberstr,
                                 @RequestParam("layerNumber") String layerNumberstr, @RequestParam("insectDungWeight") String insectDungWeightstr, @RequestParam("insectWeight") String insectWeightstr,
                                 @RequestParam(value = "remark",defaultValue = "",required = false) String remark){
        Integer cabinetNumber = Integer.parseInt(cabinetNumberstr);
        Integer layerNumber = Integer.parseInt(layerNumberstr);
        Double insectDungWeight = Double.parseDouble(insectDungWeightstr);
        Double insectWeight  = Double.parseDouble(insectWeightstr);
        return kitchenwasteDischargeService.submitAllInfo(new KitchenwasteDischarge(dischargeDate,incomeDate,cabinetNumber,layerNumber,insectDungWeight,insectWeight,remark));
    }
    @ApiOperation("获取 当日 最新 一条记录")
    @GetMapping(value = "kitchenwaste/discharge/getlast")
    public Result getlast(){
        return  ResultGenerator.genSuccessResult(kitchenwasteDischargeService.getlast());
    }
}
