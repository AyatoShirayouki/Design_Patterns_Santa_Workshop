package observables;

public interface ObservableInterface {
	public void assignDwarfToMagicBoard(ObserverInterface dwarf);
    public void releaseDwarfFromMagicBoard(String dwarfName);
    public void notifyAllDwarfs();
}
