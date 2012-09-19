package org.avangarde.gnosis.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Alexander
 */
@Entity
@Table(name = "subject")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Subject.findAll", query = "SELECT s FROM Subject s"),
    @NamedQuery(name = "Subject.findByCode", query = "SELECT s FROM Subject s WHERE s.code = :code"),
    @NamedQuery(name = "Subject.findByName", query = "SELECT s FROM Subject s WHERE s.name = :name"),
    @NamedQuery(name = "Subject.findByNumGroups", query = "SELECT s FROM Subject s WHERE s.numGroups = :numGroups")})

public class Subject implements Serializable {
    
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "code")
    private Integer code;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "numGroups")
    private int numGroups;
    @ManyToMany(mappedBy = "subjectList")
    private List<Student> studentList;
    @ManyToMany(mappedBy = "subjectList")
    private List<Program> programList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
    private List<Topic> topicList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
    private List<Event> eventList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
    private List<Studygroup> studygroupList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
    private List<Activity> activityList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
    private List<TutorSubject> tutorSubjectList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "subject")
    private List<Publication> publicationList;

    public Subject() {
    }

    public Subject(Integer code) {
        this.code = code;
    }

    public Subject(Integer code, String name, int numGroups) {
        this.code = code;
        this.name = name;
        this.numGroups = numGroups;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getNumGroups() {
        return numGroups;
    }

    public void setNumGroups(int numGroups) {
        this.numGroups = numGroups;
    }

    @XmlTransient
    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    @XmlTransient
    public List<Program> getProgramList() {
        return programList;
    }

    public void setProgramList(List<Program> programList) {
        this.programList = programList;
    }

    @XmlTransient
    public List<Topic> getTopicList() {
        return topicList;
    }

    public void setTopicList(List<Topic> topicList) {
        this.topicList = topicList;
    }

    @XmlTransient
    public List<Event> getEventList() {
        return eventList;
    }

    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    @XmlTransient
    public List<Studygroup> getStudygroupList() {
        return studygroupList;
    }

    public void setStudygroupList(List<Studygroup> studygroupList) {
        this.studygroupList = studygroupList;
    }

    @XmlTransient
    public List<Activity> getActivityList() {
        return activityList;
    }

    public void setActivityList(List<Activity> activityList) {
        this.activityList = activityList;
    }

    @XmlTransient
    public List<TutorSubject> getTutorSubjectList() {
        return tutorSubjectList;
    }

    public void setTutorSubjectList(List<TutorSubject> tutorSubjectList) {
        this.tutorSubjectList = tutorSubjectList;
    }

    @XmlTransient
    public List<Publication> getPublicationList() {
        return publicationList;
    }

    public void setPublicationList(List<Publication> publicationList) {
        this.publicationList = publicationList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (code != null ? code.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Subject)) {
            return false;
        }
        Subject other = (Subject) object;
        if ((this.code == null && other.code != null) || (this.code != null && !this.code.equals(other.code))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.com.sextus.gnosis.Subject[ code=" + code + " ]";
    }
    
}
