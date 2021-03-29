package com.guofen.controller.sjq;



import com.guofen.service.sjq.SjqSolidliquidProduceInspectionEquipmentService;
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

@RequestMapping("/sjq/solidliquidProduceInspectionEquipment")
@Controller
@Api(tags = "SjqSolidliquidProduceInspectionEquipmentController", description = "固液分离检查项目设备表")
public class SjqSolidliquidProduceInspectionEquipmentController {
    @Autowired
    private SjqSolidliquidProduceInspectionEquipmentService sjqSolidliquidProduceInspectionEquipmentService;

    @ApiOperation("添加记录_")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    @ResponseBody
    public Result add(@ApiParam(name="name",value="名称",required=true) @RequestParam String name,
                       @ApiParam(name="detail",value="细节",required=true) @RequestParam String detail,
                       @ApiParam(name="isNormal",value="是否正常",required=true) @RequestParam String isNormal){

        if (sjqSolidliquidProduceInspectionEquipmentService.add(name,detail,Boolean.parseBoolean(isNormal)))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("根据id获取设备")
    @RequestMapping(value = "/selectByPrimaryKey",method = RequestMethod.GET)
    @ResponseBody
    public Result selectByPrimaryKey(@ApiParam(name="key",value="设备id",required=true) @RequestParam String key){
        return  ResultGenerator.genSuccessResult(sjqSolidliquidProduceInspectionEquipmentService.selectByPrimaryKey(Integer.parseInt(key)));
    }

    @ApiOperation("获取设备项目列表")
    @RequestMapping(value = "/getlist",method = RequestMethod.GET)
    @ResponseBody
    public Result getlist() {
        return  ResultGenerator.genSuccessResult(sjqSolidliquidProduceInspectionEquipmentService.getlist());
    }
}
