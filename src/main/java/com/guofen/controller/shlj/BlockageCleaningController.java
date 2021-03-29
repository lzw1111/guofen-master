package com.guofen.controller.shlj;

import com.guofen.pojo.ShljBlockageCleaning;
import com.guofen.service.shlj.AbnormalGarbageService;
import com.guofen.service.shlj.BlockageCleaningService;
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

@RequestMapping("/shlj/blockageCleaning")
@Controller
@Api(tags = "BlockageCleaningController", description = "堵塞清掏记录表")
public class BlockageCleaningController {

    @Autowired
    private BlockageCleaningService blockageCleaningService;

    @ApiOperation("添加记录")
    @RequestMapping(value = "/addForm",method = RequestMethod.POST)
    @ResponseBody
    public Result addForm(@ApiParam(name="time",value="时间",required=true) @RequestParam String time,
                          @ApiParam(name="blockage_position",value="堵塞部位",required=true) @RequestParam String blockage_position,
                          @ApiParam(name="cleaning_person",value="清掏人员",required=true) @RequestParam String cleaning_person,
                          @ApiParam(name="recording_person",value="记录人员",required=true) @RequestParam String recording_person,
                          @ApiParam(name="remarks",value="备注",required=false) @RequestParam String remarks){
        if (blockageCleaningService.addForm(time, blockage_position, cleaning_person, recording_person, remarks))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("查询记录")
    @RequestMapping(value = "/findForm", method = RequestMethod.GET)
    @ResponseBody
    public Result findForm(){
        if (blockageCleaningService.findForm() != null)
            return ResultGenerator.genSuccessResult(blockageCleaningService.findForm());
        else
            return ResultGenerator.genFailResult("暂无记录");
    }
}
