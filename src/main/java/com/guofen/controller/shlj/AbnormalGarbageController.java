package com.guofen.controller.shlj;

import com.guofen.service.shlj.AbnormalGarbageService;
import com.guofen.util.Result.Result;
import com.guofen.util.Result.ResultGenerator;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/shlj/abnormolGarbage")
@Controller
@Api(tags = "AbnormalGarbageController", description = "异常垃圾情况登记表")
public class AbnormalGarbageController {

    @Autowired
    private AbnormalGarbageService abnormalGarbageService;

    @ApiOperation("添加记录")
    @RequestMapping(value = "/addForm",method = RequestMethod.POST)
    @ResponseBody
    public Result addForm(@ApiParam(name="wagon_number",value="车号",required=true) @RequestParam String wagon_number,
                          @ApiParam(name="garbage_source",value="垃圾来源(区域)",required=true) @RequestParam String garbage_source,
                          @ApiParam(name="garbage_type",value="垃圾种类",required=true) @RequestParam String garbage_type,
                          @ApiParam(name="garbage_number",value="数量",required=true) @RequestParam String garbage_number,
                          @ApiParam(name="recording_person",value="记录人",required=true) @RequestParam String recording_person,
                          @ApiParam(name="remarks",value="备注",required=false) @RequestParam String remarks){
        int garbageNumber = Integer.parseInt(garbage_number);
        if (abnormalGarbageService.addForm(wagon_number, garbage_source, garbage_type, garbageNumber, recording_person, remarks))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("查询记录")
    @RequestMapping(value = "/findForm", method = RequestMethod.GET)
    @ResponseBody
    public Result findForm(){
        if (abnormalGarbageService.findForm() != null)
            return ResultGenerator.genSuccessResult(abnormalGarbageService.findForm());
        else
            return ResultGenerator.genFailResult("暂无记录");
    }
}
