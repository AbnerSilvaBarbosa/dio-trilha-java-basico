package interfaces;

import java.util.List;

public interface IBanco {
    List<IConta> getContas();
    void setContas(IConta conta);
}
