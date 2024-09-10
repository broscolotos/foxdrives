package bidahochi.foxdrives.util;

/**
 * Enum that contains all of the data member names for data watchers and NBTTagCompound
 */
public enum DataMemberName
{
    isHeadlightsEnabled("isHeadlightsEnabled"),
    areBrakeLightsOn("areBrakeLightsOn"),
    turnSignal("turnSignal"),
    turnSignalTick("turnSignalTick"),
    isBeaconEnabled("isBeaconEnabled"),
    beaconCycleIndex("beaconCycleIndex"),
    ditchLightMode("ditchLightMode"),
    lightingDetailsJSONString("lightingDetailsJSONString"),
    lightingDetailsJSON("lightingDetailsJSON");

    public final String MemberName;

    /**Constructor for DataMemberName
     *
     * @param memberName
     */
    DataMemberName(String memberName)
    {
        MemberName = memberName;
    }

    public String AsString()
    {
        return this.MemberName;
    }
}
