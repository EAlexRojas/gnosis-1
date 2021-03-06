package org.avangarde.gnosis.businesslogic.service;

import java.util.List;
import javax.persistence.EntityManager;
import org.avangarde.gnosis.vo.TutorVo;

/**
 *
 * @author Alexander
 */
public interface IService<VO> {

    void create(VO vo, EntityManager em);

    VO find(Object id, EntityManager em);

    void update(VO vo, EntityManager em);

    void delete(Object id, EntityManager em);

    List<VO> getList(EntityManager em);

    
}
