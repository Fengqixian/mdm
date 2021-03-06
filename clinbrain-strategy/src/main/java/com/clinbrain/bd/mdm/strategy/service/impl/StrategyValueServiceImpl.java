/*
 *  Copyright (c) 2019-2020, 冷冷 (wangiegie@gmail.com).
 *  <p>
 *  Licensed under the GNU Lesser General Public License 3.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *  <p>
 * https://www.gnu.org/licenses/lgpl.html
 *  <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.clinbrain.bd.mdm.strategy.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.clinbrain.bd.mdm.strategy.entity.StrategyValue;
import com.clinbrain.bd.mdm.strategy.mapper.StrategyValueMapper;
import com.clinbrain.bd.mdm.strategy.service.StrategyValueService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 代码生成器
 *
 * @author lengleng
 * @date 2019/2/1
 */
@Slf4j
@Service
@AllArgsConstructor
public class StrategyValueServiceImpl extends ServiceImpl<StrategyValueMapper, StrategyValue> implements StrategyValueService {
    /**
     * 获取策略对应用户
     *
     * @param ruleId 策略标识
     * @return
     */
    @Override
    public List<StrategyValue> listRuleByValue(String ruleId, String strategyId) {
        return baseMapper.listRuleByValue(ruleId, strategyId);
    }

    @Override
    public void deleteStrategyValueByStrategyId(String strategyId) {
        baseMapper.deleteStrategyValueByStrategyId(strategyId);
    }


    @Override
    public IPage<StrategyValue> queryPage(Page page, String ruleId, String strategyId) {
        return baseMapper.listRuleByValuePage(page, ruleId, strategyId);
    }
}
