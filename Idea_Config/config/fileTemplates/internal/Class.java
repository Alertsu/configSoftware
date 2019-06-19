#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME};#end
#parse("File Header.java")
#set($defultAuthor="suguangfa")
/**
  *@ClassName   ${NAME}
  *@FullPath    ${PACKAGE_NAME}.${NAME}
  *@Description //TODO
  *@Author      ${USER}
  *@Date        ${DATE} ${HOUR}:${MINUTE}
  *@Version     1.0
  */
public class ${NAME} {
}
