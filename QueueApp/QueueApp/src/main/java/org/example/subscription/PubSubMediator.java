package org.example.subscription;

/**
 * Mediator that al move here communication between Subs and Pubs.
 */
public interface PubSubMediator {

    public void addSubToPub();

    public void findSubThatFitsPub();

    public void deletePubFromSub();

}
