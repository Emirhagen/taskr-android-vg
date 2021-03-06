package se.rejjd.taskmanager.model;

public final class Team {

    private long id;
    private String teamName;
    private boolean activeTeam;

    public Team(long id, String teamName) {
        this.id = id;
        this.teamName = teamName;
        this.activeTeam = true;
    }

    public long getId() {
        return id;
    }

    public String getTeamName() {
        return teamName;
    }

    public boolean isActiveTeam() {
        return activeTeam;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    @Override
    public String toString() {
        return "Team{" +
                "id=" + id +
                ", teamName='" + teamName + '\'' +
                ", activeTeam=" + activeTeam +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Team team = (Team) o;

        return id == team.id && activeTeam == team.activeTeam &&
                (teamName != null ? teamName.equals(team.teamName) : team.teamName == null);
    }

    @Override
    public int hashCode() {
        return (int) (id ^ (id >>> 32));
    }
}