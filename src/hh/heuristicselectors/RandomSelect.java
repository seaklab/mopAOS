/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hh.heuristicselectors;

import hh.creditaggregation.ICreditAggregationStrategy;
import hh.creditrepository.ICreditRepository;
import hh.nextheuristic.AbstractHeuristicSelector;
import java.util.Collection;
import org.moeaframework.core.Variation;

/**
 * RandomSelect randomly selects a heuristic with uniform probability from the 
 * given set of heuristics
 * @author nozomihitomi
 */
public class RandomSelect extends AbstractHeuristicSelector{
    
    /**
     * RandomSelect does not really utilize the credit repository so any 
     * repository will do
     * @param heuristics from which to select from 
     */
    public RandomSelect(Collection<Variation> heuristics) {
        super(heuristics);
    }

    /**
     * Randomly selects the next heuristic from the set of heuristics with 
     * uniform probability
     * @return 
     */
    @Override
    public Variation nextHeuristic() {
        incrementIterations();
        return super.getRandomHeuristic(heuristics);
    }

    @Override
    public String toString() {
        return "RandomSelect";
    }

    @Override
    public void update(ICreditRepository creditRepo, ICreditAggregationStrategy creditAgg) {
        //no need to do any updates
    }
    
}
