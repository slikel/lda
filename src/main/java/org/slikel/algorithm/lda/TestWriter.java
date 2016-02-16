package org.slikel.algorithm.lda;

import java.util.List;
import java.util.Map;

/**
 * Created by shengqiang on 16/2/2.
 */
public class TestWriter implements Writeable {

    @Override
    public void saveModelTAssign(int docId, List<Integer> wordId, List<Integer> topicId) {
        System.out.println("docId："+docId);
        System.out.println("wordIds："+wordId);
        System.out.println("topicIds："+topicId);
        System.out.println("#########################################");
        System.out.println("#########################################");
    }

    @Override
    public void saveModelTheta(int docId, List<Double> thetaList) {
        System.out.println("docId："+docId);
        System.out.println("thetaList："+thetaList);
        System.out.println("#########################################");
        System.out.println("#########################################");
    }

    @Override
    public void saveModelPhi(int topicId, List<Double> phiList) {
        System.out.println("docId："+topicId);
        System.out.println("phiList："+phiList);
        System.out.println("#########################################");
        System.out.println("#########################################");
    }

    @Override
    public void saveModelTwords(int topicId, List<String> words, List<Double> t) {
        System.out.println("docId："+topicId);
        System.out.println("words："+words);
        System.out.println("t："+t);
        System.out.println("#########################################");
        System.out.println("#########################################");
    }

    @Override
    public void saveWordMap(Map<String, Integer> wordMap) {
        System.out.println("wordMap："+wordMap);
        System.out.println("#########################################");
        System.out.println("#########################################");
    }
}
