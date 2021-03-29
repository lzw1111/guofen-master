package com.guofen.controller.sjq;

import com.guofen.service.sjq.SjqSolidliquidProduceElectricityService;
import com.guofen.util.Result.Result;
import com.guofen.util.Result.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping("/sjq/sjqSolidliquidProduceElectricity")
@Controller
@Api(tags = "SjqSolidliquidProduceElectricityController", description = "固液分离用电记录")
public class SjqSolidliquidProduceElectricityController {
    @Autowired
    private SjqSolidliquidProduceElectricityService sjqSolidliquidProduceElectricityService;

    //保存
    @ApiOperation("添加记录")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Result add(@ApiParam(name="reading",value="读数",required=true) @RequestParam String reading,
                               @ApiParam(name="reader",value="读表人",required=true) @RequestParam String reader,
                               @ApiParam(name="remarks",value="备注",required=true) @RequestParam String remarks){

        if (sjqSolidliquidProduceElectricityService.add(reading,reader,remarks))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }



    @ApiOperation("获取 当日 最新 一条记录")
    @RequestMapping(value = "/getlast",method = RequestMethod.GET)
    @ResponseBody
    public Result get(){
        return  ResultGenerator.genSuccessResult(sjqSolidliquidProduceElectricityService.getlast());
    }

}
