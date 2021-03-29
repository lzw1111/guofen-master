package com.guofen.controller.sjq;

import com.guofen.pojo.SjqSolidliquidProduceFault;
import com.guofen.service.sjq.SolidliquidProduceFaultService;
import com.guofen.util.Result.Result;
import com.guofen.util.Result.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api("固液分离生产现场故障记录表")
public class SolidliquidProduceFaultController {
    @Resource
    private SolidliquidProduceFaultService solidliquidProduceFaultService;

    @ApiOperation("提交固液分离生产现场故障记录")
    @PostMapping("/sjq/SolidliquidProduceFault/add")
    public Result add(@RequestParam("fillTime") String fillTime,@RequestParam("equipmentName") String equipmentName,@RequestParam("faultTime") String faultTime,@RequestParam("operator") String operator,@RequestParam("faultContent") String faultContent,
                      @RequestParam("serviceTimeStart") String serviceTimeStart,@RequestParam("serviceTimeEnd") String serviceTimeEnd,
                      @RequestParam("servicemanInCharge") String servicemanInCharge,@RequestParam("serviceman") String serviceman,@RequestParam("faultReason") String faultReason,
                      @RequestParam("serviceMethod") String serviceMethod,@RequestParam("proposer") String proposer,@RequestParam("recoverTime") String recoverTime,
                      @RequestParam("inspector") String inspector){
        if (solidliquidProduceFaultService.addForm(fillTime,equipmentName,faultTime,operator,faultContent,serviceTimeStart,serviceTimeEnd,servicemanInCharge,serviceman,faultReason,serviceMethod,proposer,recoverTime,inspector)){
            System.out.println("成功");
            return ResultGenerator.genSuccessResult("成功");
        }else {
            return ResultGenerator.genFailResult("保存失败");
        }
    }
    @ApiOperation("获取当日最新一条记录")
    @GetMapping("/sjq/SolidliquidProduceFault/getlast")
    public Result getlast(){
        return ResultGenerator.genSuccessResult(solidliquidProduceFaultService.findForm());
    }
}
