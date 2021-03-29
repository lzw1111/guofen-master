package com.guofen.controller.shlj;

import com.guofen.service.shlj.EquipmentMaintenanceService;
import com.guofen.util.Result.Result;
import com.guofen.util.Result.ResultGenerator;
import org.apache.ibatis.jdbc.Null;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

@RequestMapping("/shlj/equipmentMaintenance")
@Controller
@Api(tags = "EquipmentMaintenanceController", description = "设备保养计划及记录表")
public class EquipmentMaintenanceController {

    @Autowired
    private EquipmentMaintenanceService equipmentMaintenanceService;

    //保存
    @ApiOperation("添加记录_记录人")
    @RequestMapping(value = "/add_recorder",method = RequestMethod.POST)
    @ResponseBody
    public Result add_recorder(@ApiParam(name="equipmentName",value="设备名称",required=true) @RequestParam String equipmentName,
                      @ApiParam(name="operator",value="操作人",required=true) @RequestParam String operator,
                      @ApiParam(name="method",value="保养方法",required=true) @RequestParam String method,
                      @ApiParam(name="remarks",value="备注",required=true) @RequestParam String remarks){

        if (equipmentMaintenanceService.add(equipmentName,operator,method,"","",remarks))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("添加记录_检察人")
    @RequestMapping(value = "/add_examiner",method = RequestMethod.POST)
    @ResponseBody
    public Result add_examiner(@ApiParam(name="id",value="设备id",required=true) @RequestParam Integer id,
                               @ApiParam(name="examiner",value="检查人",required=true) @RequestParam String examiner,
                               @ApiParam(name="result",value="检查结果",required=true) @RequestParam String result,
                               @ApiParam(name="remarks",value="备注",required=true) @RequestParam String remarks){

        if (equipmentMaintenanceService.update(id,null,null,null,examiner,result,remarks))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("根据id获取记录")
    @RequestMapping(value = "/get",method = RequestMethod.GET)
    @ResponseBody
    public Result get(@ApiParam(name="id",value="设备id",required=true) @RequestParam Integer id){
        return  ResultGenerator.genSuccessResult(equipmentMaintenanceService.get(id));
    }

    @ApiOperation("根据名称和保养方法获取最近一周的最新记录")
    @RequestMapping(value = "/getlatest",method = RequestMethod.POST)
    @ResponseBody
    public Result getlatest(@ApiParam(name="equipmentName",value="设备名称",required=true) @RequestParam String equipmentName,
                            @ApiParam(name="maintenanceContent",value="设备保养方法",required=true) @RequestParam String maintenanceContent){
        return  ResultGenerator.genSuccessResult(equipmentMaintenanceService.getlatest(equipmentName,maintenanceContent));
    }

    @ApiOperation("获取 当日 最新 一条记录")
    @RequestMapping(value = "/getlast",method = RequestMethod.GET)
    @ResponseBody
    public Result get(){
        return  ResultGenerator.genSuccessResult(equipmentMaintenanceService.getlast());
    }
}
