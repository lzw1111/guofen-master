package com.guofen.controller.shlj;

import com.guofen.service.shlj.DeodorantSprayingtimeService;
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

@RequestMapping("/shlj/deodorantSprayingtime")
@Controller
@Api(tags = "DeodorantSprayingtimeController", description = "除臭剂喷洒时间表")
public class DeodorantSprayingtimeController {

    @Autowired
    private DeodorantSprayingtimeService deodorantSprayingtimeService;

    @ApiOperation("添加记录")
    @RequestMapping(value = "/addForm",method = RequestMethod.POST)
    @ResponseBody
    public Result addForm(@ApiParam(name="time",value="喷洒时间",required=true) @RequestParam String time,
                          @ApiParam(name="signature",value="签字",required=true) @RequestParam String signature){
        if (deodorantSprayingtimeService.addForm(time,signature))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("查询记录")
    @RequestMapping(value = "/findForm",method = RequestMethod.GET)
    @ResponseBody
    public Result findForm(){
        if (deodorantSprayingtimeService.findForm() != null)
            return ResultGenerator.genSuccessResult(deodorantSprayingtimeService.findForm());
        else
            return ResultGenerator.genFailResult("暂无记录");
    }
}
