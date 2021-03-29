package com.guofen.controller.shlj;

import com.guofen.service.shlj.ElectricityMeterService;
import com.guofen.util.Result.Result;
import com.guofen.util.Result.ResultGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RequestMapping("/shlj/electricityMeter")
@Controller
@Api(tags = "ElectricityMeterController", description = "电表记录")
public class ElectricityMeterController {

    @Autowired
    private ElectricityMeterService electricityMeterService;

    //保存
    @ApiOperation("添加记录")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Result add(@ApiParam(name="ePowerMeterReadingstr",value="动力电表读数",required=true) @RequestParam String ePowerMeterReadingstr,
                      @ApiParam(name="eLightingMeterReadingstr",value="照明电表读数",required=true) @RequestParam String eLightingMeterReadingstr,
                      @ApiParam(name="readingPerson",value="抄表人",required=true) @RequestParam String readingPerson,
                      @ApiParam(name="remarks",value="备注",required=true) @RequestParam String remarks){
        Double ePowerMeterReading = Double.parseDouble(ePowerMeterReadingstr);
        Double eLightingMeterReading = Double.parseDouble(eLightingMeterReadingstr);
        if (electricityMeterService.add(ePowerMeterReading,eLightingMeterReading,readingPerson,remarks))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("获取 当日 最新 一条记录")
    @RequestMapping(value = "/getlast",method = RequestMethod.GET)
    @ResponseBody
    public Result get(){
        return  ResultGenerator.genSuccessResult(electricityMeterService.getlast());
    }
}
