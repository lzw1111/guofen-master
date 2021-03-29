package com.guofen.controller.shlj;

import com.guofen.pojo.ShljBottleCorrodibleSortingStatistic;
import com.guofen.service.shlj.BottleCorrodibleSortingService;
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

@RequestMapping("/shlj/bottleCorrodibleSorting")
@Controller
@Api(tags = "BottleCorrodibleSortingController", description = "瓶分机可腐物分拣数据统计表")
public class BottleCorrodibleSortingController {

    @Autowired
    private BottleCorrodibleSortingService bottleCorrodibleSortingService;

    @ApiOperation("添加记录")
    @RequestMapping(value = "/addForm",method = RequestMethod.POST)
    @ResponseBody
    public Result addForm(@ApiParam(name="weightstr",value="瓶类分离机中可腐物重量（kg）",required=true) @RequestParam String weightstr,
                          @ApiParam(name="operator",value="分拣人",required=true) @RequestParam String operator,
                          @ApiParam(name="remarks",value="备注",required=false) @RequestParam String remarks){
        Double weight = Double.parseDouble(weightstr);
        if (bottleCorrodibleSortingService.addForm(weight, operator, remarks))
            return ResultGenerator.genSuccessResult();
        else
            return ResultGenerator.genFailResult("保存失败");
    }

    @ApiOperation("查询记录")
    @RequestMapping(value = "/findForm",method = RequestMethod.GET)
    @ResponseBody
    public Result findForm(){
        if (bottleCorrodibleSortingService.findForm() != null)
            return ResultGenerator.genSuccessResult(bottleCorrodibleSortingService.findForm());
        else
            return ResultGenerator.genFailResult("暂无记录");
    }
}
