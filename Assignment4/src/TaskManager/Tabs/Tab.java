package TaskManager.tabs;

import java.util.Observable;
import java.util.Observer;
import java.util.ArrayList;

public abstract class Tab extends Observable implements Observer
{
	ArrayList storage;
}

