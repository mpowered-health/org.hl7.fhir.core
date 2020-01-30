package org.hl7.fhir.convertors.conv10_50;

import org.hl7.fhir.convertors.VersionConvertor_10_50;
import org.hl7.fhir.exceptions.FHIRException;

public class Flag10_50 {

    public static org.hl7.fhir.r5.model.Flag convertFlag(org.hl7.fhir.dstu2.model.Flag src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.r5.model.Flag tgt = new org.hl7.fhir.r5.model.Flag();
        VersionConvertor_10_50.copyDomainResource(src, tgt);
        if (src.hasIdentifier()) {
            for (org.hl7.fhir.dstu2.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_50.convertIdentifier(t));
        }
        if (src.hasCategory()) {
            tgt.addCategory(VersionConvertor_10_50.convertCodeableConcept(src.getCategory()));
        }
        if (src.hasStatus()) {
            tgt.setStatus(convertFlagStatus(src.getStatus()));
        }
        if (src.hasPeriod()) {
            tgt.setPeriod(VersionConvertor_10_50.convertPeriod(src.getPeriod()));
        }
        if (src.hasSubject()) {
            tgt.setSubject(VersionConvertor_10_50.convertReference(src.getSubject()));
        }
        if (src.hasEncounter()) {
            tgt.setEncounter(VersionConvertor_10_50.convertReference(src.getEncounter()));
        }
        if (src.hasAuthor()) {
            tgt.setAuthor(VersionConvertor_10_50.convertReference(src.getAuthor()));
        }
        if (src.hasCode()) {
            tgt.setCode(VersionConvertor_10_50.convertCodeableConcept(src.getCode()));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.Flag convertFlag(org.hl7.fhir.r5.model.Flag src) throws FHIRException {
        if (src == null || src.isEmpty())
            return null;
        org.hl7.fhir.dstu2.model.Flag tgt = new org.hl7.fhir.dstu2.model.Flag();
        VersionConvertor_10_50.copyDomainResource(src, tgt);
        if (src.hasIdentifier()) {
            for (org.hl7.fhir.r5.model.Identifier t : src.getIdentifier()) tgt.addIdentifier(VersionConvertor_10_50.convertIdentifier(t));
        }
        if (src.hasCategory()) {
            tgt.setCategory(VersionConvertor_10_50.convertCodeableConcept(src.getCategoryFirstRep()));
        }
        if (src.hasStatus()) {
            tgt.setStatus(convertFlagStatus(src.getStatus()));
        }
        if (src.hasPeriod()) {
            tgt.setPeriod(VersionConvertor_10_50.convertPeriod(src.getPeriod()));
        }
        if (src.hasSubject()) {
            tgt.setSubject(VersionConvertor_10_50.convertReference(src.getSubject()));
        }
        if (src.hasEncounter()) {
            tgt.setEncounter(VersionConvertor_10_50.convertReference(src.getEncounter()));
        }
        if (src.hasAuthor()) {
            tgt.setAuthor(VersionConvertor_10_50.convertReference(src.getAuthor()));
        }
        if (src.hasCode()) {
            tgt.setCode(VersionConvertor_10_50.convertCodeableConcept(src.getCode()));
        }
        return tgt;
    }

    public static org.hl7.fhir.dstu2.model.Flag.FlagStatus convertFlagStatus(org.hl7.fhir.r5.model.Flag.FlagStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case ACTIVE:
                return org.hl7.fhir.dstu2.model.Flag.FlagStatus.ACTIVE;
            case INACTIVE:
                return org.hl7.fhir.dstu2.model.Flag.FlagStatus.INACTIVE;
            case ENTEREDINERROR:
                return org.hl7.fhir.dstu2.model.Flag.FlagStatus.ENTEREDINERROR;
            default:
                return org.hl7.fhir.dstu2.model.Flag.FlagStatus.NULL;
        }
    }

    public static org.hl7.fhir.r5.model.Flag.FlagStatus convertFlagStatus(org.hl7.fhir.dstu2.model.Flag.FlagStatus src) throws FHIRException {
        if (src == null)
            return null;
        switch(src) {
            case ACTIVE:
                return org.hl7.fhir.r5.model.Flag.FlagStatus.ACTIVE;
            case INACTIVE:
                return org.hl7.fhir.r5.model.Flag.FlagStatus.INACTIVE;
            case ENTEREDINERROR:
                return org.hl7.fhir.r5.model.Flag.FlagStatus.ENTEREDINERROR;
            default:
                return org.hl7.fhir.r5.model.Flag.FlagStatus.NULL;
        }
    }
}
