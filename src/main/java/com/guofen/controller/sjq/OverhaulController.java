package com.guofen.controller.sjq;

import com.guofen.service.sjq.OverhaulService;
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

@RequestMapping("/sjq/overhaul")
@Controller
@Api(tags = "OverhaulController", description = "大修记录表")
public class OverhaulController {

    @Autowired
    private OverhaulService overhaulService;

    @ApiOperation("添加记录")
    @RequestMapping(value = "/addForm", method = RequestMethod.POST)
    @ResponseBody
    public Result addForm(@ApiParam(name = "equipment_name", value = "设备名称", required = true) @RequestParam String equipment_name,
                          @ApiParam(name = "start_time", value = "大修开始时间", required = true) @RequestParam String start_time,
                          @ApiParam(name = "end_time", value = "大修结束时间", required = true) @RequestParam String end_time,
                          @ApiParam(name = "person_incharge", value = "大修负责人", required = true) @RequestParam String person_incharge,
                          @ApiParam(name = "process", value = "大修过程记录", required = true) @RequestParam String process){
        if (overhaulService.addForm(equipment_name, start_time, end_time, person_incharge, process))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("查询记录")
    @RequestMapping(value = "/findForm", method = RequestMethod.GET)
    @ResponseBody
    public Result findForm(){
        if (overhaulService.findForm() != null)
            return ResultGenerator.genSuccessResult(overhaulService.findForm());
        else
            return ResultGenerator.genFailResult("暂无记录");
    }
}
