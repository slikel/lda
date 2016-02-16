package org.slikel.algorithm.driver

import java.util

import org.slikel.algorithm.lda.{TestWriter, Estimator, LDACmdOption, Writeable}

/**
 * Created by shengqiang on 16/1/29.
 */
class LDADriver {

  /**
   * LDA模型生成
   * @param alpha
   * @param beta
   * @param ntopics
   * @param niters
   * @param twords
   * @param data
   */
  def estimate(alpha:Double, beta:Double, ntopics:Int, niters:Int, twords:Int, data:java.util.List[String], out:Writeable, est:Boolean): Unit = {
    val option = new LDACmdOption
    option.alpha = alpha
    option.beta = beta
    option.niters = niters
    option.K = ntopics
    option.twords = twords
    option.est = est

    val estimator: Estimator = new Estimator
    estimator.init(option, data, false, out)
    estimator.estimate
  }

}
