package com.guofen.controller.shlj;

import com.guofen.service.shlj.EquipmentRunningtimeService;
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

@RequestMapping("/shlj/equipmentRunningtime")
@Controller
@Api(tags = "EquipmentRunningtimeController", description = "设备运行时间表")
public class EquipmentRunningtimeController {

    @Autowired
    private EquipmentRunningtimeService equipmentRunningtimeService;

    @ApiOperation("添加开机时间记录")
    @RequestMapping(value = "/addStartupTime",method = RequestMethod.POST)
    @ResponseBody
    public Result addStartupTime(@ApiParam(name="startupTime",value="开机时间",required=true) @RequestParam String startupTime){
        if (equipmentRunningtimeService.addStartupTime(startupTime))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("添加关机时间记录")
    @RequestMapping(value = "/addShutdownTime",method = RequestMethod.POST)
    @ResponseBody
    public Result addShutdownTime(@ApiParam(name="shutdownTime",value="关机时间",required=true) @RequestParam String shutdownTime,
                                  @ApiParam(name="shutdownReasion",value="关机原因",required=true) @RequestParam String shutdownReasion){
        if (equipmentRunningtimeService.addShutdownTime(shutdownTime,shutdownReasion))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("查找记录")
    @RequestMapping(value = "/findForm",method = RequestMethod.GET)
    @ResponseBody
    public Result findForm(){
        if (equipmentRunningtimeService.findForm() != null)
            return ResultGenerator.genSuccessResult(equipmentRunningtimeService.findForm());
        else
            return ResultGenerator.genFailResult("暂无记录");
    }
}
