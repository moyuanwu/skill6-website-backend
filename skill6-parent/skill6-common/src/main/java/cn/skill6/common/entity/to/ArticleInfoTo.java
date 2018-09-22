package cn.skill6.common.entity.to;

import java.util.Date;

import org.springframework.stereotype.Service;

import cn.skill6.common.entity.po.ArticleInfo;
/**
 * 增加数据库实体类的字段模板类
 *
 * @author 何明胜
 * @version 1.0.0
 * @since 2018年9月22日 上午11:55:06
 */
@Service
public class ArticleInfoTo extends ArticleInfo {

  @Override
  public Long getArticleId() {
    return super.getArticleId();
  }

  @Override
  public String getArticleTitle() {
    return super.getArticleTitle();
  }

  @Override
  public String getArticleAuthor() {
    return super.getArticleAuthor();
  }

  @Override
  public String getArticleSummary() {
    return super.getArticleSummary();
  }

  @Override
  public String getArticleLabel() {
    return super.getArticleLabel();
  }

  @Override
  public Integer getArticleReadTotal() {
    return super.getArticleReadTotal();
  }

  @Override
  public Date getArticleCreateDate() {
    return super.getArticleCreateDate();
  }

  @Override
  public Date getArticleLastModifyDate() {
    return super.getArticleLastModifyDate();
  }

  @Override
  public String getArticleCategoryId() {
    return super.getArticleCategoryId();
  }

  @Override
  public Boolean getArtilcePlaceTop() {
    return super.getArtilcePlaceTop();
  }

  @Override
  public Integer getArticleTopPriority() {
    return super.getArticleTopPriority();
  }

  @Override
  public Boolean getArticleAttachFile() {
    return super.getArticleAttachFile();
  }

  @Override
  public Boolean getArticleValid() {
    return super.getArticleValid();
  }

  @Override
  public String getArticleHtmlContent() {
    return super.getArticleHtmlContent();
  }

  @Override
  public String getArticleMdContent() {
    return super.getArticleMdContent();
  }

  @Override
  public String getArticleAttachUrl() {
    return super.getArticleAttachUrl();
  }
}
