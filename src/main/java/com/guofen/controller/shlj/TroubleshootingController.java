package com.guofen.controller.shlj;

import com.guofen.service.shlj.TroubleshootingService;
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

@RequestMapping("/shlj/troubleshooting")
@Controller
@Api(tags = "TroubleshootingController", description = "故障维修原始记录表")
public class TroubleshootingController {

    @Autowired
    private TroubleshootingService troubleshootingService;

    //保存
    @ApiOperation("添加记录")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Result add(@ApiParam(name="personInCharge",value="负责人",required=true) @RequestParam String personInCharge,
                      @ApiParam(name="systemName",value="系统名称",required=true) @RequestParam String systemName,
                      @ApiParam(name="equipmentName",value="设备名称",required=true) @RequestParam String equipmentName,
                      @ApiParam(name="stage",value="阶段",required=true) @RequestParam String stage,
                      @ApiParam(name="recordingPerson",value="记录人",required=true) @RequestParam String recordingPerson,
                      @ApiParam(name="timeOfFailure",value="故障发生时间",required=true) @RequestParam String timeOfFailure,
                      @ApiParam(name="faultDescription",value="故障描述",required=true) @RequestParam String faultDescription,
                      @ApiParam(name="faultReasion",value="错误原因",required=true) @RequestParam String faultReasion,
                      @ApiParam(name="faultRepairMethod",value="错误修理方法",required=true) @RequestParam String faultRepairMethod,
                      @ApiParam(name="repairStartTime",value="维修开始时间",required=true) @RequestParam String repairStartTime,
                      @ApiParam(name="repairEndTime",value="维修结束时间",required=true) @RequestParam String repairEndTime,
                      @ApiParam(name="repairPerson",value="维修人",required=true) @RequestParam String repairPerson,
                      @ApiParam(name="methodProposer",value="维修方法提出人",required=true) @RequestParam String methodProposer){
        if (troubleshootingService.add(personInCharge,systemName,equipmentName,stage,recordingPerson,timeOfFailure,faultDescription,
                faultReasion,faultRepairMethod,repairStartTime,repairEndTime,repairPerson,methodProposer))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("获取 当日 最新 一条记录")
    @RequestMapping(value = "/getlast",method = RequestMethod.GET)
    @ResponseBody
    public Result get(){
        return  ResultGenerator.genSuccessResult(troubleshootingService.getlast());
    }
}
