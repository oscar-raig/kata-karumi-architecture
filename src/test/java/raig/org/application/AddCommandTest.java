package raig.org.application;


import static org.mockito.Matchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.mockito.Mockito;
import raig.org.domain.model.Agenda;



public class AddCommandTest {

  @Test
  public void executeShouldCallAgendaAddmethod() {
    Agenda agenda = Mockito.mock(Agenda.class);
    Application application  = Mockito.mock(Application.class);
    AddCommand addCommand  = new AddCommand(agenda,application);
    addCommand.execute();
    verify(agenda, times(1)).add(any());
  }


}
