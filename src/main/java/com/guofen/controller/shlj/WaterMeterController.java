package com.guofen.controller.shlj;

import com.guofen.service.shlj.WaterMeterService;
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

@RequestMapping("/shlj/waterMeter")
@Controller
@Api(tags = "WaterMeterController", description = "水表记录")
public class WaterMeterController {

    @Autowired
    private WaterMeterService waterMeterService;

    //保存
    @ApiOperation("添加记录")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Result add(@ApiParam(name="wMeterReadingstr",value="水表读数",required=true) @RequestParam String wMeterReadingstr,
                      @ApiParam(name="readingPerson",value="抄表人",required=true) @RequestParam String readingPerson,
                      @ApiParam(name="remarks",value="备注",required=true) @RequestParam String remarks){
        Double wMeterReading = Double.parseDouble(wMeterReadingstr);
        if (waterMeterService.add(wMeterReading,readingPerson,remarks))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("获取 当日 最新 一条记录")
    @RequestMapping(value = "/getlast",method = RequestMethod.GET)
    @ResponseBody
    public Result get(){
        return  ResultGenerator.genSuccessResult(waterMeterService.getlast());
    }
}
