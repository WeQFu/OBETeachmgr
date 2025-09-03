package com.ruoyi.teachmgr.util;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.ruoyi.common.core.domain.TreeSelect;
import com.ruoyi.teachmgr.teachplan.domain.TeachGraduationRequirement;
import com.ruoyi.teachmgr.teachstart.domain.TeachBookContent;


/**
 * @author jzg
 * @ClassName TeachMgrTreeSelect
 * @description
 * @Version
 */
public class TeachMgrTreeSelect extends TreeSelect {
    private static final long serialVersionUID = 1L;

    /** 节点ID */
    private Long id;

    /** 节点名称 */
    private String label;

    /** 子节点 */
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<TreeSelect> children;

    public TeachMgrTreeSelect()
    {

    }

    public TeachMgrTreeSelect(TeachGraduationRequirement dept)
    {
        this.id = dept.getRequirementId();
        this.label = dept.getRequirementName();
        this.children = dept.getChildren().stream().map(TeachMgrTreeSelect::new).collect(Collectors.toList());
    }

    //TeachBookContent
    public TeachMgrTreeSelect(TeachBookContent dept)
    {
        this.id = dept.getBookChapterId();
        this.label = dept.getChapterName();
        this.children = dept.getChildren().stream().map(TeachMgrTreeSelect::new).collect(Collectors.toList());
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getLabel()
    {
        return label;
    }

    public void setLabel(String label)
    {
        this.label = label;
    }


    public List<TreeSelect> getChildren()
    {
        return children;
    }

    public void setChildren(List<TreeSelect> children)
    {
        this.children = children;
    }
}
