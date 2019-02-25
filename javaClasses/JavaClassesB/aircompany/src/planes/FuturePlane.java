package planes;

import types.ProjectType;
import types.SpaceType;
import java.util.Objects;

public class FuturePlane extends Plane {

    private SpaceType spaceType;
    private ProjectType projectType;

    public FuturePlane(String model, int maxSpeed, int maxFlightDistance, int maxLoadCapacity, SpaceType spaceType, ProjectType projectType) {
        super(model, maxSpeed, maxFlightDistance, maxLoadCapacity);
        this.spaceType = spaceType;
        this.projectType = projectType;
    }

    public ProjectType getProjectType() {
        return projectType;
    }

    public SpaceType getSpaceType() {
        return spaceType;
    }


    @Override
    public String toString() {
        return super.toString().replace("}", ", Classification level is "+ projectType +", Type is "+ spaceType +'}');
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        FuturePlane that = (FuturePlane) o;
        return Objects.equals(spaceType, that.spaceType) &&
                projectType == that.projectType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), spaceType, projectType);
    }
}
