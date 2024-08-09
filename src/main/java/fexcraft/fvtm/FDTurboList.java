package fexcraft.fvtm;

import fexcraft.tmt_slim.ModelBase;
import fexcraft.tmt_slim.ModelRendererTurbo;
/**
 * A compatibility class for "FVTM Scheme/Format" or "FMT" models.
 * @Author Eternal BlueFlame
 *
 * @OriginalAuthor Ferdinand Calo' (FEX___96)
 */
public class FDTurboList extends ModelBase {

    public String boxname;
    public FDTurboList(String name){
        boxname=name;
    }

    public boolean add(ModelRendererTurbo t){
        super.addPart(t);
        return true;
    }

    @Override
    public void flip(ModelRendererTurbo[] model) {
        if(model==null){return;}
        for(ModelRendererTurbo mod : model){
            mod.rotateAngleY = -mod.rotateAngleY;
            mod.rotateAngleZ = -mod.rotateAngleZ;
        }
    }

}
