/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package initialization;

import com.norm.checker.norm.definition.BehaviorMultipleParameters;
import com.norm.checker.norm.definition.Constraint;
import com.norm.checker.norm.definition.ConstraintDate;
import com.norm.checker.norm.definition.ConstraintType;
import com.norm.checker.norm.definition.Context;
import com.norm.checker.norm.definition.ContextType;
import com.norm.checker.norm.definition.DeonticConcept;
import com.norm.checker.norm.definition.Entity;
import com.norm.checker.norm.definition.EntityType;
import com.norm.checker.norm.definition.Norm;
import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import model.ActionModel;
import model.AttributeModel;
import model.ObjectModel;
import model.Services;
import model.ValueModel;

/**
 * Its responsibility is to initialize in memory Norms.
 * To initialize Norms is also needed to initialize Actions, Objects, and Values
 * and attributes to maintain cohesion.
 * @author luccas
 */
public class Init {
    
    public Init() {
        initActions();
        initObjects();
        initAttributes();
        initNorms();
    }
    
    private void initActions() {
        List<ActionModel> actions = Services.getActionModelList();
        
        ActionModel action1 = new ActionModel();
        action1.setActionName("dress");
        
        ActionModel action2 = new ActionModel();
        action2.setActionName("paint");
        
        actions.add(action1);
        actions.add(action2);
    }
    
    private void initObjects() {
        List<ObjectModel> objects = Services.getObjectModelList();
        
        ObjectModel object1 = new ObjectModel();
        object1.setObjectName("shirt");
        
        ObjectModel object2 = new ObjectModel();
        object2.setObjectName("wall");
        
        objects.add(object1);
        objects.add(object2);
    }
    
    private void initAttributes() {
        List<AttributeModel> attributes = Services.getAttributeModelList();
        
        AttributeModel attribute1 = new AttributeModel();
        attribute1.setAttributeName("stripes");
        ValueModel value11 = new ValueModel();
        value11.setValue("horizontal");
        ValueModel value12 = new ValueModel();
        value12.setValue("vertical");
        attribute1.addValue(value11);
        attribute1.addValue(value12);
        
        AttributeModel attribute2 = new AttributeModel();
        attribute2.setAttributeName("color");
        ValueModel value21 = new ValueModel();
        value21.setValue("white");
        ValueModel value22 = new ValueModel();
        value22.setValue("green");
        attribute2.addValue(value21);
        attribute2.addValue(value22);
        
        attributes.add(attribute1);
        attributes.add(attribute2);
    }
    
    private void initNorms() {
        List<Norm> norms = Services.getNormModelList();
        
        Context context1 = new Context("outdoor", ContextType.ORGANIZATION);
        Entity entity1 = new Entity("entity", EntityType.AGENT);
        BehaviorMultipleParameters action1 = new BehaviorMultipleParameters("dress", "shirt");
        action1.addElement("stripes", "horizontal");
        Constraint activation1 = new ConstraintDate(ConstraintType.ACTIONTYPE, LocalDate.of(2011, Month.JULY, 4));
        Constraint deactivation1 = new ConstraintDate(ConstraintType.ACTIONTYPE, LocalDate.of(2016, Month.NOVEMBER, 13));
        Norm norm1 = new Norm(20l,DeonticConcept.OBLIGATION, context1, entity1, action1, activation1, deactivation1);
        
        Context context2 = new Context("outdoor", ContextType.ORGANIZATION);
        Entity entity2 = new Entity("entity", EntityType.AGENT);
        BehaviorMultipleParameters action2 = new BehaviorMultipleParameters("paint", "wall");
        action2.addElement("color", "green");
        Constraint activation2 = new ConstraintDate(ConstraintType.ACTIONTYPE, LocalDate.of(2012, Month.DECEMBER, 14));
        Constraint deactivation2 = new ConstraintDate(ConstraintType.ACTIONTYPE, LocalDate.of(2016, Month.AUGUST, 1));
        Norm norm2 = new Norm(20l,DeonticConcept.OBLIGATION, context2, entity2, action2, activation2, deactivation2);
        
        norms.add(norm1);
        norms.add(norm2);
    }
}
