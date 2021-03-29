package com.guofen.controller.sjq;

import com.guofen.service.shlj.EquipmentMaintenanceService;
import com.guofen.service.sjq.SjqSolidliquidProduceInspectionService;
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


@RequestMapping("/shlj/sjqSolidliquidProduceInspection")
@Controller
@Api(tags = "SjqSolidliquidProduceInspectionController", description = "固液分离设备检查表")
public class SjqSolidliquidProduceInspectionController {
    @Autowired
    private SjqSolidliquidProduceInspectionService sjqSolidliquidProduceInspectionService;

    //保存
    @ApiOperation("添加记录_记录人")
    @RequestMapping(value = "/add_recorder",method = RequestMethod.POST)
    @ResponseBody
    public Result add_recorder(@ApiParam(name="equipment_id",value="设备id",required=true) @RequestParam String equipment_id,
                               @ApiParam(name="operator",value="操作人",required=true) @RequestParam String operator,
                               @ApiParam(name="remarks",value="备注",required=true) @RequestParam String remarks){

        if (sjqSolidliquidProduceInspectionService.add(equipment_id,operator,null,remarks))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("添加记录_检察人")
    @RequestMapping(value = "/add_examiner",method = RequestMethod.POST)
    @ResponseBody
    public Result add_inspector(@ApiParam(name="id",value="id",required=true) @RequestParam String id,
                               @ApiParam(name="Inspector",value="记录人",required=true) @RequestParam String Inspector,
                               @ApiParam(name="remarks",value="备注",required=true) @RequestParam String remarks){

        if (sjqSolidliquidProduceInspectionService.update(id,Inspector,remarks))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("获取 当日 最新 一条记录")
    @RequestMapping(value = "/getlast_day",method = RequestMethod.GET)
    @ResponseBody
    public Result getlast_day(){
        return  ResultGenerator.genSuccessResult(sjqSolidliquidProduceInspectionService.getlast_day());
    }

    @ApiOperation("获取 本周 最新 一条记录")
    @RequestMapping(value = "/getlast_week",method = RequestMethod.GET)
    @ResponseBody
    public Result getlast_week(@ApiParam(name="equipment_id",value="设备id",required=true) @RequestParam String equipment_id){
        return  ResultGenerator.genSuccessResult(sjqSolidliquidProduceInspectionService.getlast_week(Integer.parseInt(equipment_id)));
    }
}
