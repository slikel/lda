package org.slikel.algorithm.lda;

import java.util.List;
import java.util.Map;

/**
 * Created by shengqiang on 16/2/1.
 */
public interface Writeable {

    /**
     * 保存 文档-词项-类簇 的映射数据。wordId与topicId是一一对应的。wordId、topicId代表了一个文档中
     * 词的ID于主题的ID。
     * @param wordId wordId.size = topicId.size
     * @param topicId wordId.size = topicId.size
     */
    void saveModelTAssign(int docId, List<Integer> wordId, List<Integer> topicId);

    /**
     * 保存 文档-类簇 的概率数据。每个doc所属的每个类簇的概率
     * @param docId
     * @param thetaList
     */
    void saveModelTheta(int docId, List<Double> thetaList);

    /**
     * 保存 词项-类簇 的概率数据。phiList表示id为topicId的类簇中各个词项所属这个类簇的概率
     * @param topicId
     * @param phiList
     */
    void saveModelPhi(int topicId, List<Double> phiList);

    /**
     * 保存 词项-类簇 的top10的概率数据，并找列出top10中文词项
     * @param topicId
     * @param words
     * @param t
     */
    void saveModelTwords(int topicId, List<String> words, List<Double> t);

    /**
     * 词项与ID的映射
     * @param wordMap
     */
    void saveWordMap(Map<String, Integer> wordMap);
}
