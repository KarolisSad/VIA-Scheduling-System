package mediator;

import model.*;

public interface ScheduleModel
{
  void addClass(String classID, int semester);

  void getClassFirst();

  void addStudent(String name, int studentID, String classID, int semester);

  void addTeacher(String name, String teacherID);

  void addCourse(String name, int ECTS, String mainClass,
      String firstTeacherID);

  void addSession(String courseName, int sessionLength, int dateDay,
      int dateMonth, int dateYear, int timeHour, int timeMinute,
      String roomNumber);

  RoomList getAvailableRooms(DateTime startTime, DateTime endTime);

  void addRoom(int capacity, String roomNumber);

  Room getRoomByNumber(String roomNumber);

  StudentList getCourseStudentList(Course course);

  int studentListSize();

  Student getStudent(int index);

  int sessionListSize();

  Session getSession(int index);

  model.Class getClass(int index);

  int getClassListSize();

  Teacher getTeacher(int index);

  int getTeacherSize();

  int getCourseSize();

  Course getCourse(int index);

  Course getCourseByName(String courseName);

  Room getRoom(int index);

  int getRoomListSize();

  void sortStudentsInClasses();

  void removeStudent(Student student);

  void removeStudentFromVIA(String studentID);

  void removeCourse(Course course);

  void removeCourseBy(String courseName);

  void removeTeacher(Teacher teacher);

  void removeSessionBy(String roomName, int month, int day, int hour,
      int minute);

  void createSessionListXML();

  void addStudentToCourse(String studentID, String courseName);

  void removeStudentFromCourse(String courseName, String studentID);

  void exportAll();

}