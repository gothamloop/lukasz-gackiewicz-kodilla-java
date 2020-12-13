package com.kodilla.patterns2.observer.homework;

public class MentorKodilla implements Observer {
    private final String mentorKodillaName;
    private int updateCount;

    public MentorKodilla(String mentorKodillaName) {
        this.mentorKodillaName = mentorKodillaName;
    }

    @Override
    public void update(KursantTaskQueue KursantTaskQueue) {
        System.out.println(mentorKodillaName + ": Please check task " + KursantTaskQueue.getKursantName() + "\n" +
                " (all tasks: " + KursantTaskQueue.getTasks().size());
        updateCount++;
    }

    public String getMentorKodillaName() {
        return mentorKodillaName;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}
