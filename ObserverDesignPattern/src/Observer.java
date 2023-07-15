interface Observer {

    String observerName = null;

    void setObserverName(String observerName);
    String getObserverName();
    void update();
}
